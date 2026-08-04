.class public final Lyyds/ᛱᲈᲁ;
.super Lyyds/ᛱᛸᛳᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛳᛸᛴᛶ:Lyyds/ᛵᛶᲇ;

.field public final synthetic ᛶᲈᛴᲈ:Lyyds/ᛲᛳᛶᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛳᛶᲁ;Lyyds/ᛵᛶᲇ;)V
    .locals 2

    .line 1
    const-wide v0, -0xd5b7e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛱᲈᲁ;->ᛶᲈᛴᲈ:Lyyds/ᛲᛳᛶᲁ;

    .line 10
    .line 11
    iget-object p1, p2, Lyyds/ᛵᛶᲇ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 12
    .line 13
    check-cast p1, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lyyds/ᛱᛸᛳᛵ;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lyyds/ᛱᲈᲁ;->ᛳᛸᛴᛶ:Lyyds/ᛵᛶᲇ;

    .line 19
    .line 20
    return-void
.end method

.method public static ᛵᛶᛲᲀ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/16 v0, 0xd

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-gt v0, p0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-static {p0, p1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᲀᲈᛲ(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "\u2026"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
