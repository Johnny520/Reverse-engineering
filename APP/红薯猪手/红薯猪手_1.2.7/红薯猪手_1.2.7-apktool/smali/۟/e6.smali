.class public final L۟/e6;
.super L۟/za;
.source "SourceFile"


# instance fields
.field public ۥ:Z

.field public ۥ۟:Lde/robv/android/xposed/XC_MethodHook$Unhook;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/za;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, L۟/c1;->ۥ۠۠:L۟/c1;

    invoke-static {p1}, L۟/e1;->ۥ(L۟/c1;)Z

    move-result p1

    iput-boolean p1, p0, L۟/e6;->ۥ:Z

    return-void

    nop

    :array_0
    .array-data 1
        -0x41t
        -0x2ct
        0x55t
        -0x41t
        0x38t
        -0x14t
        -0x44t
        -0x18t
        0x5bt
        -0x4ft
        0x38t
    .end array-data

    :array_1
    .array-data 1
        -0x31t
        -0x5at
        0x3at
        -0x24t
        0x5dt
        -0x61t
    .end array-data
.end method
