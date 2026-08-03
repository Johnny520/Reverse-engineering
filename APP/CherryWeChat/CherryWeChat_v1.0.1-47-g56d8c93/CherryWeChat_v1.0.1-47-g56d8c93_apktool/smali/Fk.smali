.class public final LFk;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:LFk;

.field public static final KEY_SIZE_FIELD_NUMBER:I = 0x2

.field public static final PARAMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x3


# instance fields
.field private keySize_:I

.field private params_:LIk;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFk;

    invoke-direct {v0}, Lvj;-><init>()V

    sput-object v0, LFk;->DEFAULT_INSTANCE:LFk;

    const-class v1, LFk;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public static B()LEk;
    .locals 1

    sget-object v0, LFk;->DEFAULT_INSTANCE:LFk;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, LEk;

    return-object v0
.end method

.method public static C(Ly6;LTg;)LFk;
    .locals 1

    sget-object v0, LFk;->DEFAULT_INSTANCE:LFk;

    invoke-static {v0, p0, p1}, Lvj;->r(Lvj;Ly6;LTg;)Lvj;

    move-result-object p0

    check-cast p0, LFk;

    return-object p0
.end method

.method public static w(LFk;LIk;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LFk;->params_:LIk;

    return-void
.end method

.method public static x(LFk;I)V
    .locals 0

    iput p1, p0, LFk;->keySize_:I

    return-void
.end method

.method public static y()LFk;
    .locals 1

    sget-object v0, LFk;->DEFAULT_INSTANCE:LFk;

    return-object v0
.end method


# virtual methods
.method public final A()LIk;
    .locals 1

    iget-object v0, p0, LFk;->params_:LIk;

    if-nez v0, :cond_0

    invoke-static {}, LIk;->y()LIk;

    move-result-object v0

    :cond_0
    return-object v0
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
    sget-object p1, LFk;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, LFk;

    monitor-enter v0

    :try_start_0
    sget-object p1, LFk;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, LFk;->PARSER:LKt;

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
    sget-object p1, LFk;->DEFAULT_INSTANCE:LFk;

    return-object p1

    :pswitch_2
    new-instance p1, LEk;

    sget-object v0, LFk;->DEFAULT_INSTANCE:LFk;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, LFk;

    invoke-direct {p1}, Lvj;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "params_"

    const-string v0, "keySize_"

    const-string v1, "version_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b"

    sget-object v1, LFk;->DEFAULT_INSTANCE:LFk;

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

.method public final z()I
    .locals 1

    iget v0, p0, LFk;->keySize_:I

    return v0
.end method
