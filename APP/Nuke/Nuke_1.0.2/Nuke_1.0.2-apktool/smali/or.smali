.class public final synthetic Lor;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lor;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lor;->i:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lor;->j:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lor;->k:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lor;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Lor;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v5, p0, Lor;->j:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lor;->i:Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lgr;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    if-eq p1, v3, :cond_1

    .line 27
    .line 28
    if-ne p1, v2, :cond_0

    .line 29
    .line 30
    move-object v1, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v1, v5

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, p0

    .line 39
    :goto_0
    return-object v1

    .line 40
    :pswitch_0
    check-cast p1, Lir;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    if-eq p1, v3, :cond_4

    .line 52
    .line 53
    if-ne p1, v2, :cond_3

    .line 54
    .line 55
    move-object v1, v4

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {}, Lc80;->s()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    move-object v1, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_5
    move-object v1, p0

    .line 64
    :goto_1
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
