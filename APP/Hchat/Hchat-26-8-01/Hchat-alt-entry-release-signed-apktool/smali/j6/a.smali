.class public final synthetic Lj6/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lj6/o;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Type;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj6/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lj6/a;->h:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lj6/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj6/a;->h:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    const-string v2, "Invalid EnumSet type: "

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v3, 0x0

    .line 22
    aget-object v1, v1, v3

    .line 23
    .line 24
    instance-of v3, v1, Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-static {v0, v2}, Li8/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-static {v0, v2}, Li8/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :goto_1
    return-object v0

    .line 45
    :pswitch_0
    iget-object v0, p0, Lj6/a;->h:Ljava/lang/reflect/Type;

    .line 46
    .line 47
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 48
    .line 49
    const-string v2, "Invalid EnumMap type: "

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v3, 0x0

    .line 61
    aget-object v1, v1, v3

    .line 62
    .line 63
    instance-of v3, v1, Ljava/lang/Class;

    .line 64
    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    new-instance v0, Ljava/util/EnumMap;

    .line 68
    .line 69
    check-cast v1, Ljava/lang/Class;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    invoke-static {v0, v2}, Li8/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    const/4 v0, 0x0

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    invoke-static {v0, v2}, Li8/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_3
    return-object v0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
