.class public LYue/ۥ۟ۤۤۦ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;


# instance fields
.field public ۥ:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x428

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥ۟ۤۤۦ;->ۥ:J

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥ۟ۤۤۦ;)J
.end method

.method public static native synthetic ۥ۟(LYue/ۥ۟ۤۤۦ;J)J
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end method
