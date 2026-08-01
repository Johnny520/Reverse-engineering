.class public final Lkm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lkm;

.field public static final β:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkm;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkm;->α:Lkm;

    .line 7
    .line 8
    const-string v0, "javax."

    .line 9
    .line 10
    const-string v1, "kotlin."

    .line 11
    .line 12
    const-string v2, "android."

    .line 13
    .line 14
    const-string v3, "androidx."

    .line 15
    .line 16
    const-string v4, "java."

    .line 17
    .line 18
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lkm;->β:Ljava/util/List;

    .line 27
    .line 28
    return-void
.end method
