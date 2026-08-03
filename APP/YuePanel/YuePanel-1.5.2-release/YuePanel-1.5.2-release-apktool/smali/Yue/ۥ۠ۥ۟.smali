.class public abstract LYue/ۥ۠ۥ۟;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ">;"
        }
    .end annotation
.end method

.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native getClickStrings()[Ljava/lang/String;
.end method

.method public native getLongClickStrings()[Ljava/lang/String;
.end method

.method public abstract info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end method

.method public native load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end method

.method public native onCheck(Ljava/lang/String;Landroid/widget/Switch;)Z
.end method

.method public native onClick()V
.end method

.method public native onLongClick()V
.end method
