package top.linl.dexparser.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import p035.C7092;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FileUtils {
    public static void deleteFile(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                deleteFile(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public static String getSize(long j) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            if (j / 1073741824 >= 1) {
                return decimalFormat.format(j / 1.0737418E9f) + "GB";
            }
            if (j / 1048576 >= 1) {
                return decimalFormat.format(j / 1048576.0f) + "MB";
            }
            if (j / 1024 >= 1) {
                return decimalFormat.format(j / 1024.0f) + "KB";
            }
            return j + "B";
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] readAllByte(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(i);
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    try {
                        bArr = new byte[1024];
                    } catch (Exception e) {
                        e = e;
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return null;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            bufferedInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        while (true) {
            int i2 = bufferedInputStream.read(bArr, 0, 1024);
            if (-1 == i2) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            th = th;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    public static Object readFileObject(File file) throws IOException {
        if (file == null || !file.exists()) {
            if (file != null) {
                C7092.m12336(file.getAbsolutePath(), "path No exists(文件不存在) ");
                return null;
            }
            C6755.m11866("Empty File object");
            return null;
        }
        if (file.isDirectory()) {
            C7092.m12336(file.getAbsolutePath(), "Non-file type(这个File是文件夹而不是文件) :");
            return null;
        }
        Kryo kryo = new Kryo();
        kryo.setRegistrationRequired(false);
        Input input = new Input(new FileInputStream(file));
        Object classAndObject = kryo.readClassAndObject(input);
        input.close();
        return classAndObject;
    }

    public static Object readFiliObject(String str) {
        return readFileObject(new File(str));
    }

    public static void writeObjectToFile(File file, Object obj) throws IOException {
        try {
            if (!file.exists()) {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
            }
            Kryo kryo = new Kryo();
            kryo.setRegistrationRequired(false);
            Output output = new Output(new FileOutputStream(file));
            kryo.writeClassAndObject(output, obj);
            output.close();
        } catch (IOException e) {
            writeTextToFile(file.getAbsolutePath(), "", false);
            throw e;
        }
    }

    public static void writeTextToFile(String str, String str2, boolean z) {
        File file = new File(str);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z), StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(str2);
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void writeObjectToFile(String str, Object obj) {
        writeObjectToFile(new File(str), obj);
    }
}
