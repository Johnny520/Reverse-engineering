.class public final enum LOn;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[LOn;

.field public static final Companion:LMn;

.field public static final enum ON_ANY:LOn;

.field public static final enum ON_CREATE:LOn;

.field public static final enum ON_DESTROY:LOn;

.field public static final enum ON_PAUSE:LOn;

.field public static final enum ON_RESUME:LOn;

.field public static final enum ON_START:LOn;

.field public static final enum ON_STOP:LOn;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LOn;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOn;->ON_CREATE:LOn;

    new-instance v1, LOn;

    const-string v2, "ON_START"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LOn;->ON_START:LOn;

    new-instance v2, LOn;

    const-string v3, "ON_RESUME"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, LOn;->ON_RESUME:LOn;

    new-instance v3, LOn;

    const-string v4, "ON_PAUSE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, LOn;->ON_PAUSE:LOn;

    new-instance v4, LOn;

    const-string v5, "ON_STOP"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, LOn;->ON_STOP:LOn;

    new-instance v5, LOn;

    const-string v6, "ON_DESTROY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, LOn;->ON_DESTROY:LOn;

    new-instance v6, LOn;

    const-string v7, "ON_ANY"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, LOn;->ON_ANY:LOn;

    filled-new-array/range {v0 .. v6}, [LOn;

    move-result-object v0

    sput-object v0, LOn;->$VALUES:[LOn;

    new-instance v0, LMn;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LOn;->Companion:LMn;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LOn;
    .locals 1

    const-class v0, LOn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LOn;

    return-object p0
.end method

.method public static values()[LOn;
    .locals 1

    sget-object v0, LOn;->$VALUES:[LOn;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOn;

    return-object v0
.end method


# virtual methods
.method public final a()LPn;
    .locals 3

    sget-object v0, LNn;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no target state"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, LPn;->a:LPn;

    return-object v0

    :pswitch_1
    sget-object v0, LPn;->e:LPn;

    return-object v0

    :pswitch_2
    sget-object v0, LPn;->d:LPn;

    return-object v0

    :pswitch_3
    sget-object v0, LPn;->c:LPn;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
