/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */



import com.facebook.thrift.lite.*;
import com.facebook.thrift.lite.protocol.*;


public class Module {

  public enum EventType {
    Internship, Range;
  }

  public static final ThriftProperty<Integer> Internship_weeks =
      new ThriftProperty<Integer>("weeks", TType.I32, (short) 1);
  public static final ThriftProperty<String> Internship_title =
      new ThriftProperty<String>("title", TType.STRING, (short) 2);
  public static final ThriftProperty<ModuleEnum> Internship_employer =
      new ThriftProperty<ModuleEnum>("employer", TType.I32, (short) 3);
  public static final ThriftProperty<Integer> Range_min =
      new ThriftProperty<Integer>("min", TType.I32, (short) 1);
  public static final ThriftProperty<Integer> Range_max =
      new ThriftProperty<Integer>("max", TType.I32, (short) 2);
  
}
