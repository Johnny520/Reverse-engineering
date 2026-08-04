.class public final Lyyds/ᛶᛸᛳᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᛴᲈᛴ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲁᛶᲇᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛶᲇᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᛸᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛶᲇᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Lyyds/ᛳᲈᛲᲈ;
    .locals 1

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    new-instance v0, Lyyds/ᲀᛵᲁᛴ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛸᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛶᲇᛱ;

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Lyyds/ᲀᛵᲁᛴ;-><init>(Ljava/io/InputStream;Lyyds/ᲁᛶᲇᛱ;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
