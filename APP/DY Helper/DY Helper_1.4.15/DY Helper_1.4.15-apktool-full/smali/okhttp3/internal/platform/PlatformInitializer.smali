.class public final Lokhttp3/internal/platform/PlatformInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lxl0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxl0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final α()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    return-object p0
.end method

.method public final β(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lgh1;->α:Lf0;

    .line 5
    .line 6
    sget-object p0, Lgh1;->α:Lf0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iput-object p1, p0, Lf0;->β:Landroid/content/Context;

    .line 15
    .line 16
    :cond_1
    sget-object p0, Lgh1;->α:Lf0;

    .line 17
    .line 18
    return-object p0
.end method
