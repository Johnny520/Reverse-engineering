.class public final LD1;
.super Lvj;
.source ""


# static fields
.field public static final AES_CTR_KEY_FORMAT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:LD1;

.field public static final HMAC_KEY_FORMAT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LKt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field


# instance fields
.field private aesCtrKeyFormat_:LJ1;

.field private hmacKeyFormat_:LFk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD1;

    invoke-direct {v0}, Lvj;-><init>()V

    sput-object v0, LD1;->DEFAULT_INSTANCE:LD1;

    const-class v1, LD1;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public static A()LC1;
    .locals 1

    sget-object v0, LD1;->DEFAULT_INSTANCE:LD1;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, LC1;

    return-object v0
.end method

.method public static B(Ly6;LTg;)LD1;
    .locals 1

    sget-object v0, LD1;->DEFAULT_INSTANCE:LD1;

    invoke-static {v0, p0, p1}, Lvj;->r(Lvj;Ly6;LTg;)Lvj;

    move-result-object p0

    check-cast p0, LD1;

    return-object p0
.end method

.method public static w(LD1;LJ1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LD1;->aesCtrKeyFormat_:LJ1;

    return-void
.end method

.method public static x(LD1;LFk;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LD1;->hmacKeyFormat_:LFk;

    return-void
.end method


# virtual methods
.method public final i(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, LEy;->v(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, LD1;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, LD1;

    monitor-enter v0

    :try_start_0
    sget-object p1, LD1;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, LD1;->PARSER:LKt;

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
    sget-object p1, LD1;->DEFAULT_INSTANCE:LD1;

    return-object p1

    :pswitch_2
    new-instance p1, LC1;

    sget-object v0, LD1;->DEFAULT_INSTANCE:LD1;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, LD1;

    invoke-direct {p1}, Lvj;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "aesCtrKeyFormat_"

    const-string v0, "hmacKeyFormat_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"

    sget-object v1, LD1;->DEFAULT_INSTANCE:LD1;

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

.method public final y()LJ1;
    .locals 1

    iget-object v0, p0, LD1;->aesCtrKeyFormat_:LJ1;

    if-nez v0, :cond_0

    invoke-static {}, LJ1;->y()LJ1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final z()LFk;
    .locals 1

    iget-object v0, p0, LD1;->hmacKeyFormat_:LFk;

    if-nez v0, :cond_0

    invoke-static {}, LFk;->y()LFk;

    move-result-object v0

    :cond_0
    return-object v0
.end method
