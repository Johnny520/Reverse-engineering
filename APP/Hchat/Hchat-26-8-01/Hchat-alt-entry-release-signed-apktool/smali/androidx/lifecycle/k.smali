.class public final enum Landroidx/lifecycle/k;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final synthetic $ENTRIES:Lzf/a;

.field private static final synthetic $VALUES:[Landroidx/lifecycle/k;

.field public static final Companion:Landroidx/lifecycle/i;

.field public static final enum ON_ANY:Landroidx/lifecycle/k;

.field public static final enum ON_CREATE:Landroidx/lifecycle/k;

.field public static final enum ON_DESTROY:Landroidx/lifecycle/k;

.field public static final enum ON_PAUSE:Landroidx/lifecycle/k;

.field public static final enum ON_RESUME:Landroidx/lifecycle/k;

.field public static final enum ON_START:Landroidx/lifecycle/k;

.field public static final enum ON_STOP:Landroidx/lifecycle/k;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Landroidx/lifecycle/k;

    .line 2
    .line 3
    const-string v1, "ON_CREATE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/lifecycle/k;->ON_CREATE:Landroidx/lifecycle/k;

    .line 10
    .line 11
    new-instance v1, Landroidx/lifecycle/k;

    .line 12
    .line 13
    const-string v2, "ON_START"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Landroidx/lifecycle/k;->ON_START:Landroidx/lifecycle/k;

    .line 20
    .line 21
    new-instance v2, Landroidx/lifecycle/k;

    .line 22
    .line 23
    const-string v3, "ON_RESUME"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Landroidx/lifecycle/k;->ON_RESUME:Landroidx/lifecycle/k;

    .line 30
    .line 31
    new-instance v3, Landroidx/lifecycle/k;

    .line 32
    .line 33
    const-string v4, "ON_PAUSE"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Landroidx/lifecycle/k;->ON_PAUSE:Landroidx/lifecycle/k;

    .line 40
    .line 41
    new-instance v4, Landroidx/lifecycle/k;

    .line 42
    .line 43
    const-string v5, "ON_STOP"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Landroidx/lifecycle/k;->ON_STOP:Landroidx/lifecycle/k;

    .line 50
    .line 51
    new-instance v5, Landroidx/lifecycle/k;

    .line 52
    .line 53
    const-string v6, "ON_DESTROY"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Landroidx/lifecycle/k;->ON_DESTROY:Landroidx/lifecycle/k;

    .line 60
    .line 61
    new-instance v6, Landroidx/lifecycle/k;

    .line 62
    .line 63
    const-string v7, "ON_ANY"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Landroidx/lifecycle/k;->ON_ANY:Landroidx/lifecycle/k;

    .line 70
    .line 71
    filled-new-array/range {v0 .. v6}, [Landroidx/lifecycle/k;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Landroidx/lifecycle/k;->$VALUES:[Landroidx/lifecycle/k;

    .line 76
    .line 77
    new-instance v1, Lzf/b;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Lzf/b;-><init>([Ljava/lang/Enum;)V

    .line 80
    .line 81
    .line 82
    sput-object v1, Landroidx/lifecycle/k;->$ENTRIES:Lzf/a;

    .line 83
    .line 84
    new-instance v0, Landroidx/lifecycle/i;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    sput-object v0, Landroidx/lifecycle/k;->Companion:Landroidx/lifecycle/i;

    .line 90
    .line 91
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/lifecycle/k;
    .locals 1

    .line 1
    const-class v0, Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/lifecycle/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroidx/lifecycle/k;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/k;->$VALUES:[Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroidx/lifecycle/k;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/l;
    .locals 3

    .line 1
    sget-object v0, Landroidx/lifecycle/j;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lokio/a;->k()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " has no target state"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :pswitch_1
    sget-object v0, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_2
    sget-object v0, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_3
    sget-object v0, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_4
    sget-object v0, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 50
    .line 51
    return-object v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
