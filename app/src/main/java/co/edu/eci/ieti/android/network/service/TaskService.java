package co.edu.eci.ieti.android.network.service;

import co.edu.eci.ieti.android.network.data.LoginWrapper;
import co.edu.eci.ieti.android.network.data.Task;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface TaskService {

    @GET( "task" )
    Call<Task> getAllTasks();

}
