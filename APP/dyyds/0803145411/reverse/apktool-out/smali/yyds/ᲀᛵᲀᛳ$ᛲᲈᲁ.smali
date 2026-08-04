.class public Lyyds/ᲀᛵᲀᛳ$ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛴ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᲀᛵᲀᛳ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
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
.method public final ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 0

    .line 1
    iget-object p0, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p1, Ljava/sql/Date;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    new-instance p0, Lyyds/ᲀᛵᲀᛳ;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lyyds/ᲀᛵᲀᛳ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
