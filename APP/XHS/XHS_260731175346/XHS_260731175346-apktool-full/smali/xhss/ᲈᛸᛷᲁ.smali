.class public final Lxhss/ᲈᛸᛷᲁ;
.super Lxhss/ᛵᛵᛲᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛸᛷᲈᲈ:Lxhss/ᲇᛲᛶᛴ;


# direct methods
.method public constructor <init>(Lxhss/ᛸᲀᛲᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲇᛲᛶᛴ;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lxhss/ᲇᛲᛶᛴ;-><init>(Lxhss/ᛸᲀᛲᛴ;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲈᛸᛷᲁ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛲᛶᛴ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛳᛶᛷᲀ(Z)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    iget-object p0, p0, Lxhss/ᲈᛸᛷᲁ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛲᛶᛴ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᲇᛲᛶᛴ;->ᛳᛶᛷᲀ(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ᛷᲁᲁ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_1
    iget-object p0, p0, Lxhss/ᲈᛸᛷᲁ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛲᛶᛴ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᲇᛲᛶᛴ;->ᛷᲁᲁ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᲁᛲᛴᛴ(Z)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object p0, p0, Lxhss/ᲈᛸᛷᲁ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛲᛶᛴ;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iput-boolean p1, p0, Lxhss/ᲇᛲᛶᛴ;->ᛷᲁᲁ:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Lxhss/ᲇᛲᛶᛴ;->ᲁᛲᛴᛴ(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
