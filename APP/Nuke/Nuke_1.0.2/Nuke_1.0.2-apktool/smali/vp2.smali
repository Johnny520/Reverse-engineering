.class public final Lvp2;
.super Lv70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lvp2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lvp2;

    .line 2
    .line 3
    sget-object v1, Lwp2;->d:Lwp2;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lwp2;->e:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, ".MethodResourceGetString"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lhk1;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Lv70;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lvp2;->b:Lvp2;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lorg/luckypray/dexkit/DexKitBridge;)V
    .locals 2

    .line 1
    new-instance v0, Lml2;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lml2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lv70;->c(Lorg/luckypray/dexkit/DexKitBridge;Lin0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
