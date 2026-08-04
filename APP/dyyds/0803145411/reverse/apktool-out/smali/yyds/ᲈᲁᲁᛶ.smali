.class public final Lyyds/ᲈᲁᲁᛶ;
.super Lyyds/ᲀᛶᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᲈᲁᲁᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p0, p0, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛴᛳᛲ()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lyyds/ᲈᲁᲁᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lyyds/ᛷᛸᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲁᛷᛷ;

    .line 10
    .line 11
    invoke-virtual {p4, v0, p0, p3}, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛳᛶᲁ()Lyyds/ᲀᛶᲁᛵ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v0, p2, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᲁᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
