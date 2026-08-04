.class public final Lyyds/ᛶᛶᛶᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛶᛶᛶᲈ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 1

    .line 1
    iget-object p2, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Lyyds/ᲇᛸᲇᛱ;

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛶᛶᛶᲈ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    invoke-direct {p2, p1, p0}, Lyyds/ᲇᛸᲇᛱ;-><init>(Lyyds/ᛱᛴᲇᲀ;I)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
