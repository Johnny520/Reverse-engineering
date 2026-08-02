.class public final synthetic Lrc3;
.super Ly32;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final o:Lrc3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lrc3;

    .line 2
    .line 3
    const-string v1, "wxId"

    .line 4
    .line 5
    const-string v2, "getWxId()Ljava/lang/String;"

    .line 6
    .line 7
    const-class v3, Ljc3;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ly32;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lrc3;->o:Lrc3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljc3;

    .line 2
    .line 3
    iget-object p0, p1, Ljc3;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
