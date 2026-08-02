.class public final synthetic Lw0;
.super Ly32;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final o:Lw0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lw0;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    const-string v2, "getId()Ljava/lang/String;"

    .line 6
    .line 7
    const-class v3, Lnuke/module/wechat/ai/AIModelInfo;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ly32;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lw0;->o:Lw0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lnuke/module/wechat/ai/AIModelInfo;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
