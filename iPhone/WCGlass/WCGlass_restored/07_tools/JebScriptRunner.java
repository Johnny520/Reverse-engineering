import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Path;

/** Small compatibility launcher for JEB's script-runner v2. */
public final class JebScriptRunner {
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException("usage: SCRIPT LIBRARY_DIR INPUT_FILE [script args...]");
        }
        String script = Path.of(args[0]).toAbsolutePath().toString();
        String library = Path.of(args[1]).toAbsolutePath().toString();
        String input = Path.of(args[2]).toAbsolutePath().toString();
        String[] scriptArgs = new String[Math.max(0, args.length - 3)];
        if (scriptArgs.length != 0) {
            System.arraycopy(args, 3, scriptArgs, 0, scriptArgs.length);
        }

        Class<?> cls = Class.forName("com.pnfsoftware.jeb.Mp");
        Constructor<?> ctor = cls.getConstructor(boolean.class, String.class,
                String.class, String.class, String[].class);
        Object client = ctor.newInstance(true, script, library, input, scriptArgs);
        Method initialize = cls.getMethod("initialize", String[].class);
        Method start = cls.getMethod("start");
        Method stop = cls.getMethod("stop");
        System.out.println("[runner] initialize");
        System.out.flush();
        String logfile = Path.of("WCGlass_output", "jeb_headless.log").toAbsolutePath().toString();
        initialize.invoke(client, (Object)new String[]{"--logfile=" + logfile + ",DEBUG,2,20,0"});
        try {
            System.out.println("[runner] start");
            System.out.flush();
            start.invoke(client);
        }
        catch(Throwable t) {
            t.printStackTrace(System.err);
            throw t;
        }
        finally {
            System.out.println("[runner] stop");
            System.out.flush();
            stop.invoke(client);
        }
    }
}
