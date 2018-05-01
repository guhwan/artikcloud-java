/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.api;

import cloud.artik.client.ApiException;
import cloud.artik.model.AcceptanceStatusResponse;
import cloud.artik.model.DeviceTaskUpdateRequest;
import cloud.artik.model.DeviceTaskUpdateResponse;
import cloud.artik.model.DeviceTypesInfo;
import cloud.artik.model.DeviceTypesInfoEnvelope;
import cloud.artik.model.MetadataEnvelope;
import cloud.artik.model.MetadataPropertiesEnvelope;
import cloud.artik.model.MetadataQueryEnvelope;
import cloud.artik.model.PendingTasksList;
import cloud.artik.model.TaskByDidListEnvelope;
import cloud.artik.model.TaskEnvelope;
import cloud.artik.model.TaskListEnvelope;
import cloud.artik.model.TaskRequest;
import cloud.artik.model.TaskStatusesEnvelope;
import cloud.artik.model.TaskStatusesHistoryEnvelope;
import cloud.artik.model.TaskUpdateRequest;
import cloud.artik.model.TaskUpdateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesManagementApi
 */
@Ignore
public class DevicesManagementApiTest {

    private final DevicesManagementApi api = new DevicesManagementApi();

    
    /**
     * Create a new task for one or more devices
     *
     * Create a new task for one or more devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTasksTest() throws ApiException {
        TaskRequest taskPayload = null;
        TaskEnvelope response = api.createTasks(taskPayload);

        // TODO: test validations
    }
    
    /**
     * Deletes a device&#39;s properties.
     *
     * Deletes a device&#39;s properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServerPropertiesTest() throws ApiException {
        String did = null;
        MetadataEnvelope response = api.deleteServerProperties(did);

        // TODO: test validations
    }
    
    /**
     * Returns the list of tasks for a particular device id with optional status filter.
     *
     * Returns the list of tasks for a particular device id with optional status filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllByDidTest() throws ApiException {
        String did = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String order = null;
        String sort = null;
        TaskByDidListEnvelope response = api.getAllByDid(did, count, offset, status, order, sort);

        // TODO: test validations
    }
    
    /**
     * Returns the list of  pending tasks for a particular device id.
     *
     * Returns the list of all pending tasks (where acceptanceStatus is equal to WAITING ) for a particular device id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPendingTasksByDidTest() throws ApiException {
        PendingTasksList response = api.getAllPendingTasksByDid();

        // TODO: test validations
    }
    
    /**
     * Read a device type device management information.
     *
     * Read a device type device management information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTypesInfoTest() throws ApiException {
        String dtid = null;
        DeviceTypesInfoEnvelope response = api.getDeviceTypesInfo(dtid);

        // TODO: test validations
    }
    
    /**
     * Get a device type&#39;s device management manifest properties
     *
     * Get a device type&#39;s device management manifest properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getManifestPropertiesTest() throws ApiException {
        String dtid = null;
        MetadataPropertiesEnvelope response = api.getManifestProperties(dtid);

        // TODO: test validations
    }
    
    /**
     * Read a device&#39;s properties.
     *
     * Read a device&#39;s properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertiesTest() throws ApiException {
        String did = null;
        Boolean includeTimestamp = null;
        MetadataEnvelope response = api.getProperties(did, includeTimestamp);

        // TODO: test validations
    }
    
    /**
     * Returns the details and status of a task id and the individual statuses of each device id in the list.
     *
     * Returns the details and status of a task id and the individual statuses of each device id in the list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusesTest() throws ApiException {
        String tid = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String dids = null;
        TaskStatusesEnvelope response = api.getStatuses(tid, count, offset, status, dids);

        // TODO: test validations
    }
    
    /**
     * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
     *
     * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusesHistoryTest() throws ApiException {
        String tid = null;
        String did = null;
        TaskStatusesHistoryEnvelope response = api.getStatusesHistory(tid, did);

        // TODO: test validations
    }
    
    /**
     * Returns the details and global status of a specific task id.
     *
     * Returns the details and global status of a specific task id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskByIDTest() throws ApiException {
        String tid = null;
        TaskEnvelope response = api.getTaskByID(tid);

        // TODO: test validations
    }
    
    /**
     * Returns the all the tasks for a device type.
     *
     * Returns the all the tasks for a device type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksTest() throws ApiException {
        String dtid = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String order = null;
        String sort = null;
        TaskListEnvelope response = api.getTasks(dtid, count, offset, status, order, sort);

        // TODO: test validations
    }
    
    /**
     * Notify/Inform about task acceptance status
     *
     * User notify/informs to ARTIKCloud about task acceptance status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyAboutAcceptanceTest() throws ApiException {
        String tid = null;
        String did = null;
        AcceptanceStatusResponse notifyAboutAcceptanceStatus = null;
        AcceptanceStatusResponse response = api.notifyAboutAcceptance(tid, did, notifyAboutAcceptanceStatus);

        // TODO: test validations
    }
    
    /**
     * Query device properties across devices.
     *
     * Query device properties across devices.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryPropertiesTest() throws ApiException {
        String dtid = null;
        Integer count = null;
        Integer offset = null;
        String filter = null;
        Boolean includeTimestamp = null;
        MetadataQueryEnvelope response = api.queryProperties(dtid, count, offset, filter, includeTimestamp);

        // TODO: test validations
    }
    
    /**
     * Updates a device type information
     *
     * Updates a device type information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTypesInfoTest() throws ApiException {
        String dtid = null;
        DeviceTypesInfo deviceTypeInfo = null;
        DeviceTypesInfoEnvelope response = api.updateDeviceTypesInfo(dtid, deviceTypeInfo);

        // TODO: test validations
    }
    
    /**
     * Updates a device&#39;s server properties.
     *
     * Updates a device&#39;s server properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateServerPropertiesTest() throws ApiException {
        String did = null;
        Object deviceProperties = null;
        MetadataEnvelope response = api.updateServerProperties(did, deviceProperties);

        // TODO: test validations
    }
    
    /**
     * Updates a task for all devices - For now just allows changing the state to cancelled.
     *
     * Updates a task for all devices - For now just allows changing the state to cancelled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskTest() throws ApiException {
        String tid = null;
        TaskUpdateRequest taskUpdateRequest = null;
        TaskUpdateResponse response = api.updateTask(tid, taskUpdateRequest);

        // TODO: test validations
    }
    
    /**
     * Updates a task for a specific device - For now just allows changing the state to cancelled.
     *
     * Updates a task for a specific device - For now just allows changing the state to cancelled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskForDeviceTest() throws ApiException {
        String tid = null;
        String did = null;
        DeviceTaskUpdateRequest deviceTaskUpdateRequest = null;
        DeviceTaskUpdateResponse response = api.updateTaskForDevice(tid, did, deviceTaskUpdateRequest);

        // TODO: test validations
    }
    
}
