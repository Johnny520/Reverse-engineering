package com.esotericsoftware.kryo.util;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.ClassResolver;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultClassResolver implements ClassResolver {
    public static final byte NAME = -1;
    protected IdentityObjectIntMap<Class> classToNameId;
    protected Kryo kryo;
    private Class memoizedClass;
    private Registration memoizedClassIdValue;
    private Registration memoizedClassValue;
    protected IntMap<Class> nameIdToClass;
    protected ObjectMap<String, Class> nameToClass;
    protected int nextNameId;
    protected final IntMap<Registration> idToRegistration = new IntMap<>();
    protected final IdentityMap<Class, Registration> classToRegistration = new IdentityMap<>();
    private int memoizedClassId = -1;

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(Class cls) {
        if (cls == this.memoizedClass) {
            return this.memoizedClassValue;
        }
        Registration registration = this.classToRegistration.get(cls);
        if (registration != null) {
            this.memoizedClass = cls;
            this.memoizedClassValue = registration;
        }
        return registration;
    }

    public Class getTypeByName(String str) {
        ObjectMap<String, Class> objectMap = this.nameToClass;
        if (objectMap != null) {
            return objectMap.get(str);
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration readClass(Input input) {
        int varInt = input.readVarInt(true);
        if (varInt == 0) {
            if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
                Util.log("Read", null, input.position());
            }
            return null;
        }
        if (varInt == 1) {
            return readName(input);
        }
        if (varInt == this.memoizedClassId) {
            if (Log.TRACE) {
                StringBuilder sb = new StringBuilder("Read class ");
                sb.append(varInt - 2);
                sb.append(": ");
                sb.append(Util.className(this.memoizedClassIdValue.getType()));
                sb.append(Util.pos(input.position()));
                Log.trace("kryo", sb.toString());
            }
            return this.memoizedClassIdValue;
        }
        int i = varInt - 2;
        Registration registration = this.idToRegistration.get(i);
        if (registration == null) {
            throw new KryoException(AbstractC6183.m11588(i, "Encountered unregistered class ID: "));
        }
        if (Log.TRACE) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "Read class ", ": ");
            sbM150.append(Util.className(registration.getType()));
            sbM150.append(Util.pos(input.position()));
            Log.trace("kryo", sbM150.toString());
        }
        this.memoizedClassId = varInt;
        this.memoizedClassIdValue = registration;
        return registration;
    }

    public Registration readName(Input input) {
        int varInt = input.readVarInt(true);
        if (this.nameIdToClass == null) {
            this.nameIdToClass = new IntMap<>();
        }
        Class<?> cls = this.nameIdToClass.get(varInt);
        if (cls == null) {
            String string = input.readString();
            Class<?> typeByName = getTypeByName(string);
            if (typeByName == null) {
                try {
                    typeByName = Class.forName(string, false, this.kryo.getClassLoader());
                } catch (ClassNotFoundException e) {
                    try {
                        typeByName = Class.forName(string, false, Kryo.class.getClassLoader());
                    } catch (ClassNotFoundException unused) {
                        throw new KryoException(AbstractC0053.m157("Unable to find class: ", string), e);
                    }
                }
                if (this.nameToClass == null) {
                    this.nameToClass = new ObjectMap<>();
                }
                this.nameToClass.put(string, typeByName);
            }
            this.nameIdToClass.put(varInt, typeByName);
            if (Log.TRACE) {
                Log.trace("kryo", "Read class name: " + string + Util.pos(input.position()));
            }
            cls = typeByName;
        } else if (Log.TRACE) {
            StringBuilder sbM150 = AbstractC0053.m150(varInt, "Read class name reference ", ": ");
            sbM150.append(Util.className(cls));
            sbM150.append(Util.pos(input.position()));
            Log.trace("kryo", sbM150.toString());
        }
        return this.kryo.getRegistration(cls);
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration register(Registration registration) {
        this.memoizedClassId = -1;
        this.memoizedClass = null;
        if (registration == null) {
            C5925.m11310("registration cannot be null.");
            return null;
        }
        if (registration.getId() != -1) {
            if (Log.TRACE) {
                Log.trace("kryo", "Register class ID " + registration.getId() + ": " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
            }
            this.idToRegistration.put(registration.getId(), registration);
        } else if (Log.TRACE) {
            Log.trace("kryo", "Register class name: " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
        }
        this.classToRegistration.put(registration.getType(), registration);
        Class wrapperClass = Util.getWrapperClass(registration.getType());
        if (wrapperClass != registration.getType()) {
            this.classToRegistration.put(wrapperClass, registration);
        }
        return registration;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration registerImplicit(Class cls) {
        return register(new Registration(cls, this.kryo.getDefaultSerializer(cls), -1));
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void reset() {
        if (this.kryo.isRegistrationRequired()) {
            return;
        }
        IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
        if (identityObjectIntMap != null) {
            identityObjectIntMap.clear(2048);
        }
        IntMap<Class> intMap = this.nameIdToClass;
        if (intMap != null) {
            intMap.clear();
        }
        this.nextNameId = 0;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration unregister(int i) {
        Registration registrationRemove = this.idToRegistration.remove(i);
        if (registrationRemove != null) {
            this.classToRegistration.remove(registrationRemove.getType());
            this.memoizedClassId = -1;
            this.memoizedClass = null;
            Class wrapperClass = Util.getWrapperClass(registrationRemove.getType());
            if (wrapperClass != registrationRemove.getType()) {
                this.classToRegistration.remove(wrapperClass);
            }
        }
        return registrationRemove;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration writeClass(Output output, Class cls) {
        if (cls == null) {
            if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
                Util.log("Write", null, output.position());
            }
            output.writeByte((byte) 0);
            return null;
        }
        Registration registration = this.kryo.getRegistration(cls);
        if (registration.getId() == -1) {
            writeName(output, cls, registration);
            return registration;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Write class " + registration.getId() + ": " + Util.className(cls) + Util.pos(output.position()));
        }
        output.writeVarInt(registration.getId() + 2, true);
        return registration;
    }

    public void writeName(Output output, Class cls, Registration registration) {
        int i;
        output.writeByte(1);
        IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
        if (identityObjectIntMap != null && (i = identityObjectIntMap.get(cls, -1)) != -1) {
            if (Log.TRACE) {
                StringBuilder sbM150 = AbstractC0053.m150(i, "Write class name reference ", ": ");
                sbM150.append(Util.className(cls));
                sbM150.append(Util.pos(output.position()));
                Log.trace("kryo", sbM150.toString());
            }
            output.writeVarInt(i, true);
            return;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Write class name: " + Util.className(cls) + Util.pos(output.position()));
        }
        int i2 = this.nextNameId;
        this.nextNameId = i2 + 1;
        if (this.classToNameId == null) {
            this.classToNameId = new IdentityObjectIntMap<>();
        }
        this.classToNameId.put(cls, i2);
        output.writeVarInt(i2, true);
        if (registration.isTypeNameAscii()) {
            output.writeAscii(cls.getName());
        } else {
            output.writeString(cls.getName());
        }
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(int i) {
        return this.idToRegistration.get(i);
    }
}
