.class public final L۟/o3;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "L\u06df/mc;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/g3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/g3<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, L۟/y2$c;->ۥ:L۟/y2$c;

    iput-object v0, p0, L۟/o3;->ۥ:L۟/g3;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, L۟/mc;

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    fill-array-data v1, :array_1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, L۟/o3;->ۥ:L۟/g3;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, L۟/mc;->ۥ(L۟/g3;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 29
    .line 30
    return-object p1

    .line 31
    :array_0
    .array-data 1
        0x38t
        -0x80t
        -0x2bt
        -0x57t
        0x3ft
        0x62t
        0x74t
        -0x65t
        -0x2et
        -0x55t
        0xdt
        0x2at
        0x70t
        -0x47t
        -0x28t
        -0x4ct
        0x24t
        0x29t
        0x78t
        -0x79t
    .end array-data

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :array_1
    .array-data 1
        0x1ct
        -0xct
        -0x43t
        -0x40t
        0x4ct
        0x46t
    .end array-data
.end method
