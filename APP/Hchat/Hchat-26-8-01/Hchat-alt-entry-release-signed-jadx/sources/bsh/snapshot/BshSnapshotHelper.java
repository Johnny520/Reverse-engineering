package bsh.snapshot;

import com.alibaba.fastjson2.JSONB;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BshSnapshotHelper {
    private static final int GCM_TAG_BITS = 128;
    private static final int HEADER_VERSION = 1;
    private static final int IV_LENGTH = 12;
    private static final byte[] MAGIC = {66, 83, JSONB.Constants.BC_INT32, 83};
    private static final SecureRandom RANDOM = new SecureRandom();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FilteringObjectInputStream extends ObjectInputStream {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FilteringObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
            if (BshSnapshotHelper.isAllowed(clsResolveClass)) {
                return clsResolveClass;
            }
            throw new InvalidClassException("BeanShell snapshot rejected class: ".concat(clsResolveClass.getName()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshSnapshotHelper() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAllowed(Class<?> cls) {
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            while (componentType != null && componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (componentType != null) {
                return componentType.isPrimitive() || isAllowed(componentType);
            }
            return false;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls == String.class || cls == Boolean.class || cls == Character.class || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || cls == Enum.class || Enum.class.isAssignableFrom(cls) || cls.getName().startsWith("java.lang.invoke.") || cls.getName().startsWith("java.lang.constant.")) {
            return true;
        }
        return cls.getName().startsWith("bsh.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshSnapshot readEncrypted(InputStream inputStream, SecretKey secretKey) throws IOException {
        byte[] bArr = MAGIC;
        if (!Arrays.equals(readExact(inputStream, bArr.length), bArr)) {
            C2104o.m5299y("BeanShell snapshot invalid header");
            return null;
        }
        int i9 = inputStream.read();
        if (i9 != 1) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "BeanShell snapshot unsupported version: "));
            return null;
        }
        int i10 = inputStream.read();
        if (i10 <= 0 || i10 > 32) {
            C2104o.m5299y("BeanShell snapshot invalid IV length");
            return null;
        }
        byte[] exact = readExact(inputStream, i10);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, exact));
            FilteringObjectInputStream filteringObjectInputStream = new FilteringObjectInputStream(new CipherInputStream(inputStream, cipher));
            try {
                Object object = filteringObjectInputStream.readObject();
                if (!(object instanceof BshSnapshot)) {
                    throw new InvalidClassException("BeanShell snapshot unexpected payload");
                }
                BshSnapshot bshSnapshot = (BshSnapshot) object;
                if (bshSnapshot.getFormatVersion() == 1) {
                    filteringObjectInputStream.close();
                    return bshSnapshot;
                }
                throw new IOException("BeanShell snapshot unsupported AST format: " + bshSnapshot.getFormatVersion());
            } catch (Throwable th2) {
                try {
                    filteringObjectInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (ClassNotFoundException e6) {
            throw new IOException("BeanShell snapshot class not found", e6);
        } catch (GeneralSecurityException e7) {
            throw new IOException("BeanShell snapshot decrypt failed", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] readExact(InputStream inputStream, int i9) throws IOException {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int i11 = inputStream.read(bArr, i10, i9 - i10);
            if (i11 < 0) {
                C2104o.m5299y("BeanShell snapshot unexpected end");
                return null;
            }
            i10 += i11;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void writeEncrypted(BshSnapshot bshSnapshot, OutputStream outputStream, SecretKey secretKey) throws IOException {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        outputStream.write(MAGIC);
        outputStream.write(1);
        outputStream.write(12);
        outputStream.write(bArr);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey, new GCMParameterSpec(128, bArr));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(outputStream, cipher));
            try {
                objectOutputStream.writeObject(bshSnapshot);
                objectOutputStream.close();
            } finally {
            }
        } catch (GeneralSecurityException e6) {
            throw new IOException("BeanShell snapshot encrypt failed", e6);
        }
    }
}
