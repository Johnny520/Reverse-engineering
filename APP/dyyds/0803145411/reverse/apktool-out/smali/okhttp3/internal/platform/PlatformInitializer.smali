.class public final Lokhttp3/internal/platform/PlatformInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛲᛶᲈ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyyds/\u16f6\u16f2\u16f6\u1c88;"
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
.method public final ᛲᲈᲁ()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲀᛳᛶᛸ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 12
    .line 13
    :cond_1
    sget-object p0, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 14
    .line 15
    return-object p0
.end method
