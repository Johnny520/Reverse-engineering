.class public final Lxhss/ᛶᛲᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᲀᛶᛲ;
.implements Lxhss/ᲈᛶᛶᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛶᛲᛷᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛶᛲᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛶᛲᛷᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "<"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lxhss/ᛶᛲᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x3e

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛱᛲᲇ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lxhss/ᛶᛲᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget p0, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x3

    .line 16
    .line 17
    or-int/lit8 p0, p0, 0x4

    .line 18
    .line 19
    iput p0, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public ᛳᲁᲇᛸ()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛶᛲᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method
