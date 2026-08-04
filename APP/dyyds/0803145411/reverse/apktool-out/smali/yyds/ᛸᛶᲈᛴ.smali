.class public final Lyyds/ᛸᛶᲈᛴ;
.super Lyyds/ᛵᲇᛸᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᛸᛵᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᛸᛵᲁ;Lyyds/ᛸᛷᛶᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lyyds/ᛵᲇᛸᛴ;-><init>(Lyyds/ᛸᛷᛶᲇ;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛶᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛸᛵᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᲀᛲᛴᲇ;Lyyds/ᛸᛵᲁᛲ;)V
    .locals 1

    .line 1
    iget-object p0, p3, Lyyds/ᛸᛵᲁᛲ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    iget-object v0, p3, Lyyds/ᛸᛵᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛸᛷ;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p3, Lyyds/ᛸᛵᲁᛲ;->ᛶᛷᛲᲁ:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    iget-boolean p3, p3, Lyyds/ᛸᛵᲁᛲ;->ᛱᲈᲁ:Z

    .line 18
    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    invoke-static {p0, p1}, Lyyds/ᛶᛳᛶᲀ;->ᲇᲈᛵᛷ(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 31
    .line 32
    const-string p2, "Cannot set value of \'static final\' "

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛶᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛸᛵᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲀᛸᛵᲁ;->ᛵᛸᛸᛷ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
