.class public final Lxhss/ᛲᛳᛴᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛱᛱᛲᲇ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛷᛵᛵᲈ(Ljava/lang/String;I)Lxhss/ᛷᛱᛳᲁ;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/regex/Pattern;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p2, p1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->lookingAt()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lxhss/ᛷᛱᛳᲁ;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lxhss/ᛷᛱᛳᲁ;-><init>(Ljava/util/regex/Matcher;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method
