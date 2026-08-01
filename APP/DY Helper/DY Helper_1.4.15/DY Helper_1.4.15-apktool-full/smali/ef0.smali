.class public final Lef0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lef0;

.field private static final β:C = '/'

.field private static final γ:C

.field public static final δ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lef0;

    .line 2
    .line 3
    invoke-direct {v0}, Lef0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lef0;->α:Lef0;

    .line 7
    .line 8
    const/16 v0, 0x2e

    .line 9
    .line 10
    sput-char v0, Lef0;->γ:C

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/16 p0, 0x2f

    .line 11
    .line 12
    sget-char v0, Lef0;->γ:C

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "\u5bbf\u4e3b\u7c7b\u8def\u5f84\u4e0d\u80fd\u4e3a\u7a7a"

    .line 23
    .line 24
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method
