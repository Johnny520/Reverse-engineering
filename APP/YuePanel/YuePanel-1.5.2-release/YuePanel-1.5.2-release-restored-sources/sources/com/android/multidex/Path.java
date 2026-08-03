package com.android.multidex;

import com.android.p001dx.p002cf.direct.DirectClassFile;
import com.android.p001dx.p002cf.direct.StdAttributeFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String definition;
    List<ClassPathElement> elements = new ArrayList();
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream(40960);
    private final byte[] readBuffer = new byte[20480];

    public Path(String str) throws IOException {
        this.definition = str;
        for (String str2 : str.split(Pattern.quote(File.pathSeparator))) {
            try {
                addElement(getClassPathElement(new File(str2)));
            } catch (IOException e) {
                throw new IOException("Wrong classpath: " + e.getMessage(), e);
            }
        }
    }

    private void addElement(ClassPathElement classPathElement) {
        this.elements.add(classPathElement);
    }

    public static ClassPathElement getClassPathElement(File file) throws IOException {
        if (file.isDirectory()) {
            return new FolderPathElement(file);
        }
        if (file.isFile()) {
            return new ArchivePathElement(new ZipFile(file));
        }
        if (file.exists()) {
            throw new IOException("\"" + file.getPath() + "\" is not a directory neither a zip file");
        }
        throw new FileNotFoundException("File \"" + file.getPath() + "\" not found");
    }

    private static byte[] readStream(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) throws IOException {
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        throw new java.io.FileNotFoundException("File \"" + r7 + "\" not found");
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0037: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:13:0x0037 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized DirectClassFile getClass(String str) throws FileNotFoundException {
        DirectClassFile directClassFile;
        DirectClassFile directClassFile2;
        Throwable th;
        try {
            Iterator<ClassPathElement> it = this.elements.iterator();
            directClassFile = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    try {
                        InputStream inputStreamOpen = it.next().open(str);
                        try {
                            byte[] stream = readStream(inputStreamOpen, this.baos, this.readBuffer);
                            this.baos.reset();
                            DirectClassFile directClassFile3 = new DirectClassFile(stream, str, false);
                            try {
                                directClassFile3.setAttributeFactory(StdAttributeFactory.THE_ONE);
                                inputStreamOpen.close();
                                directClassFile = directClassFile3;
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStreamOpen.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException unused) {
                        directClassFile = directClassFile2;
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
        }
        return directClassFile;
    }

    public Iterable<ClassPathElement> getElements() {
        return this.elements;
    }

    public String toString() {
        return this.definition;
    }
}
