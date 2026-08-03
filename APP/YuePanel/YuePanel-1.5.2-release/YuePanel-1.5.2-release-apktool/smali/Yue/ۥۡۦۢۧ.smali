.class public LYue/ۥۡۦۢۧ;
.super Ljava/lang/RuntimeException;


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x407

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, LYue/ۥۡۦۢۧ;->ۥۣ۟۟۠:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public native ۥ()Ljava/lang/Exception;
.end method

.method public native ۥ۟()Z
.end method
