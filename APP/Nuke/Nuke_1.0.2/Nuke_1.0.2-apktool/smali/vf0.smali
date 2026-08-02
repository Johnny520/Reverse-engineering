.class public final synthetic Lvf0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lwf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvf0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lvf0;->i:I

    .line 8
    .line 9
    iput-object p2, p0, Lvf0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lvf0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lqv0;ILcg0;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lvf0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvf0;->j:Ljava/lang/Object;

    iput p2, p0, Lvf0;->i:I

    iput-object p3, p0, Lvf0;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lvf0;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lvf0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lvf0;->i:I

    .line 6
    .line 7
    iget-object p0, p0, Lvf0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lqv0;

    .line 13
    .line 14
    check-cast v1, Lcg0;

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqv0;->D:Lyv0;

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lyv0;->k(ILcg0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    sget-object v1, Lcg0;->k:Lcg0;

    .line 24
    .line 25
    invoke-virtual {p0, v1, v1, v0}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    check-cast v1, Lwf0;

    .line 34
    .line 35
    new-array v0, v2, [Lyo2;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_1
    if-ge v4, v2, :cond_0

    .line 40
    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/16 v6, 0x2e

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lb12;->e:[Ljava/lang/String;

    .line 55
    .line 56
    aget-object v6, v6, v4

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v6, Lyv2;->j:Lyv2;

    .line 66
    .line 67
    new-array v7, v3, [Lyo2;

    .line 68
    .line 69
    invoke-static {v5, v6, v7}, Lup0;->j(Ljava/lang/String;Ls11;[Lyo2;)Lap2;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    aput-object v5, v0, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    return-object v0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
