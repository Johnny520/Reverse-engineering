.class public final Lrn;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:Lrn;

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I

.field private typeUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrn;

    invoke-direct {v0}, Lrn;-><init>()V

    sput-object v0, Lrn;->DEFAULT_INSTANCE:Lrn;

    const-class v1, Lrn;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lrn;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public static B()Lqn;
    .locals 1

    sget-object v0, Lrn;->DEFAULT_INSTANCE:Lrn;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, Lqn;

    return-object v0
.end method

.method public static w(Lrn;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lrn;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public static x(Lrn;Lyt;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lyt;->b()I

    move-result p1

    iput p1, p0, Lrn;->outputPrefixType_:I

    return-void
.end method

.method public static y(Lrn;Lcn;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcn;->a()I

    move-result p1

    iput p1, p0, Lrn;->status_:I

    return-void
.end method

.method public static z(Lrn;I)V
    .locals 0

    iput p1, p0, Lrn;->keyId_:I

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lrn;->keyId_:I

    return v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, LEy;->v(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lrn;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lrn;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lrn;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lrn;->PARSER:LKt;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Lrn;->DEFAULT_INSTANCE:Lrn;

    return-object p1

    :pswitch_2
    new-instance p1, Lqn;

    sget-object v0, Lrn;->DEFAULT_INSTANCE:Lrn;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lrn;

    invoke-direct {p1}, Lrn;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "typeUrl_"

    const-string v0, "status_"

    const-string v1, "keyId_"

    const-string v2, "outputPrefixType_"

    filled-new-array {p1, v0, v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object v1, Lrn;->DEFAULT_INSTANCE:Lrn;

    new-instance v2, Lbv;

    invoke-direct {v2, v1, v0, p1}, Lbv;-><init>(LB;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
