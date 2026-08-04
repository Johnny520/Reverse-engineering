.class public final Lyyds/ᲈᲁᛸᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᲀᛱᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲁᛸᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛸᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛸᲀᛱᛴ;->ᛶᛸᲀᲁ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v0, v0, Lyyds/ᛳᛴᲀᲈ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Lyyds/ᛸᲀᛱᛴ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 16
    .line 17
    return-object p0
.end method
