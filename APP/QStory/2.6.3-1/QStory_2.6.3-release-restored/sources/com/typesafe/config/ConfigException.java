package com.typesafe.config;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.typesafe.config.impl.AbstractC4696;
import com.typesafe.config.impl.C4670;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p025.AbstractC7012;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConfigException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient InterfaceC8990 origin;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ValidationFailed extends ConfigException {
        private static final long serialVersionUID = 1;
        private final Iterable<ValidationProblem> problems;

        public ValidationFailed(Iterable<ValidationProblem> iterable) {
            super(makeMessage(iterable), (Throwable) null);
            this.problems = iterable;
        }

        private static String makeMessage(Iterable<ValidationProblem> iterable) {
            StringBuilder sb = new StringBuilder();
            for (ValidationProblem validationProblem : iterable) {
                sb.append(((C4670) validationProblem.origin()).m8769());
                sb.append(": ");
                sb.append(validationProblem.path());
                sb.append(": ");
                sb.append(validationProblem.problem());
                sb.append(", ");
            }
            if (sb.length() != 0) {
                sb.setLength(sb.length() - 2);
                return sb.toString();
            }
            C3775.m6968("ValidationFailed must have a non-empty list of problems");
            return null;
        }

        public Iterable<ValidationProblem> problems() {
            return this.problems;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ValidationProblem implements Serializable {
        private final transient InterfaceC8990 origin;
        private final String path;
        private final String problem;

        public ValidationProblem(String str, InterfaceC8990 interfaceC8990, String str2) {
            this.path = str;
            this.origin = interfaceC8990;
            this.problem = str2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ConfigException.setOriginField(this, ValidationProblem.class, AbstractC4696.m8806(objectInputStream));
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            AbstractC4696.m8803(objectOutputStream, this.origin);
        }

        public InterfaceC8990 origin() {
            return this.origin;
        }

        public String path() {
            return this.path;
        }

        public String problem() {
            return this.problem;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ValidationProblem(");
            sb.append(this.path);
            sb.append(",");
            sb.append(this.origin);
            sb.append(",");
            return AbstractC0900.m711(sb, this.problem, ")");
        }
    }

    public ConfigException(InterfaceC8990 interfaceC8990, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        C4670 c4670 = (C4670) interfaceC8990;
        sb.append(c4670.m8769());
        sb.append(": ");
        sb.append(str);
        super(sb.toString(), th);
        this.origin = c4670;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        setOriginField(this, ConfigException.class, AbstractC4696.m8806(objectInputStream));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void setOriginField(T t, Class<T> cls, InterfaceC8990 interfaceC8990) throws IOException {
        try {
            Field declaredField = cls.getDeclaredField("origin");
            declaredField.setAccessible(true);
            try {
                declaredField.set(t, interfaceC8990);
            } catch (IllegalAccessException e) {
                throw new IOException("unable to set origin field", e);
            } catch (IllegalArgumentException e2) {
                throw new IOException("unable to set origin field", e2);
            }
        } catch (NoSuchFieldException e3) {
            throw new IOException(cls.getSimpleName().concat(" has no origin field?"), e3);
        } catch (SecurityException e4) {
            throw new IOException("unable to fill out origin field in ".concat(cls.getSimpleName()), e4);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC4696.m8803(objectOutputStream, this.origin);
    }

    public InterfaceC8990 origin() {
        return this.origin;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class BadBean extends BugOrBroken {
        private static final long serialVersionUID = 1;

        public BadBean(String str) {
            this(str, null);
        }

        public BadBean(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class BugOrBroken extends ConfigException {
        private static final long serialVersionUID = 1;

        public BugOrBroken(String str) {
            this(str, null);
        }

        public BugOrBroken(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Generic extends ConfigException {
        private static final long serialVersionUID = 1;

        public Generic(String str) {
            this(str, null);
        }

        public Generic(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.typesafe.config.ConfigException$IO */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class C0360IO extends ConfigException {
        private static final long serialVersionUID = 1;

        public C0360IO(InterfaceC8990 interfaceC8990, String str) {
            this(interfaceC8990, str, null);
        }

        public C0360IO(InterfaceC8990 interfaceC8990, String str, Throwable th) {
            super(interfaceC8990, str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class NotResolved extends BugOrBroken {
        private static final long serialVersionUID = 1;

        public NotResolved(String str) {
            this(str, null);
        }

        public NotResolved(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Parse extends ConfigException {
        private static final long serialVersionUID = 1;

        public Parse(InterfaceC8990 interfaceC8990, String str) {
            this(interfaceC8990, str, null);
        }

        public Parse(InterfaceC8990 interfaceC8990, String str, Throwable th) {
            super(interfaceC8990, str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Null extends Missing {
        private static final long serialVersionUID = 1;

        public Null(InterfaceC8990 interfaceC8990, String str, String str2, Throwable th) {
            super(interfaceC8990, makeMessage(str, str2), th);
        }

        private static String makeMessage(String str, String str2) {
            return str2 != null ? AbstractC7012.m12140("Configuration key '", str, "' is set to null but expected ", str2) : AbstractC0900.m718("Configuration key '", str, "' is null");
        }

        public Null(InterfaceC8990 interfaceC8990, String str, String str2) {
            this(interfaceC8990, str, str2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class BadValue extends ConfigException {
        private static final long serialVersionUID = 1;

        public BadValue(InterfaceC8990 interfaceC8990, String str, String str2, Throwable th) {
            super(interfaceC8990, AbstractC7012.m12140("Invalid value at '", str, "': ", str2), th);
        }

        public BadValue(InterfaceC8990 interfaceC8990, String str, String str2) {
            this(interfaceC8990, str, str2, null);
        }

        public BadValue(String str, String str2, Throwable th) {
            super(AbstractC7012.m12140("Invalid value at '", str, "': ", str2), th);
        }

        public BadValue(String str, String str2) {
            this(str, str2, (Throwable) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class UnresolvedSubstitution extends Parse {
        private static final long serialVersionUID = 1;
        private final String detail;

        public UnresolvedSubstitution(InterfaceC8990 interfaceC8990, String str, Throwable th) {
            super(interfaceC8990, AbstractC0900.m717("Could not resolve substitution to a value: ", str), th);
            this.detail = str;
        }

        public UnresolvedSubstitution addExtraDetail(String str) {
            return new UnresolvedSubstitution(this, origin(), String.format(str, this.detail));
        }

        public UnresolvedSubstitution(InterfaceC8990 interfaceC8990, String str) {
            this(interfaceC8990, str, (Throwable) null);
        }

        private UnresolvedSubstitution(UnresolvedSubstitution unresolvedSubstitution, InterfaceC8990 interfaceC8990, String str) {
            super(interfaceC8990, str, unresolvedSubstitution);
            this.detail = unresolvedSubstitution.detail;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Missing extends ConfigException {
        private static final long serialVersionUID = 1;

        public Missing(InterfaceC8990 interfaceC8990, String str) {
            this(interfaceC8990, AbstractC0900.m718("No configuration setting found for key '", str, "'"), null);
        }

        public Missing(String str, Throwable th) {
            super(AbstractC0900.m718("No configuration setting found for key '", str, "'"), th);
        }

        public Missing(String str) {
            this(str, (Throwable) null);
        }

        public Missing(InterfaceC8990 interfaceC8990, String str, Throwable th) {
            super(interfaceC8990, str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class BadPath extends ConfigException {
        private static final long serialVersionUID = 1;

        public BadPath(InterfaceC8990 interfaceC8990, String str, String str2, Throwable th) {
            super(interfaceC8990, str != null ? AbstractC7012.m12140("Invalid path '", str, "': ", str2) : str2, th);
        }

        public BadPath(InterfaceC8990 interfaceC8990, String str, String str2) {
            this(interfaceC8990, str, str2, null);
        }

        public BadPath(String str, String str2, Throwable th) {
            super(str != null ? AbstractC7012.m12140("Invalid path '", str, "': ", str2) : str2, th);
        }

        public BadPath(String str, String str2) {
            this(str, str2, (Throwable) null);
        }

        public BadPath(InterfaceC8990 interfaceC8990, String str) {
            this(interfaceC8990, (String) null, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class WrongType extends ConfigException {
        private static final long serialVersionUID = 1;

        public WrongType(InterfaceC8990 interfaceC8990, String str, String str2, String str3, Throwable th) {
            super(interfaceC8990, str + " has type " + str3 + " rather than " + str2, th);
        }

        public WrongType(InterfaceC8990 interfaceC8990, String str, String str2, String str3) {
            this(interfaceC8990, str, str2, str3, null);
        }

        public WrongType(InterfaceC8990 interfaceC8990, String str, Throwable th) {
            super(interfaceC8990, str, th);
        }

        public WrongType(InterfaceC8990 interfaceC8990, String str) {
            super(interfaceC8990, str, null);
        }
    }

    public ConfigException(InterfaceC8990 interfaceC8990, String str) {
        this(((C4670) interfaceC8990).m8769() + ": " + str, (Throwable) null);
    }

    public ConfigException(String str, Throwable th) {
        super(str, th);
        this.origin = null;
    }

    public ConfigException(String str) {
        this(str, (Throwable) null);
    }
}
