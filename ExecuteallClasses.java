package org.basictestcase;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ClassA.class, ClassB.class})


public class ExecuteallClasses 

{

@Test
public void executeall()
{
	Result r=JUnitCore.runClasses(ClassA.class, ClassB.class);
int count=r.getRunCount();
System.out.println(count);

int igncount=r.getIgnoreCount();
System.out.println(igncount);

int failcount=r.getFailureCount();
System.out.println(failcount);
}

}
