.class public final LUf;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:LUf;

.field public static final ENCRYPTED_KEYSET_FIELD_NUMBER:I = 0x2

.field public static final KEYSET_INFO_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LKt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field


# instance fields
.field private encryptedKeyset_:Ly6;

.field private keysetInfo_:Lsn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUf;

    invoke-direct {v0}, LUf;-><init>()V

    sput-object v0, LUf;->DEFAULT_INSTANCE:LUf;

    const-class v1, LUf;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    sget-object v0, Ly6;->b:Lx6;

    iput-object v0, p0, LUf;->encryptedKeyset_:Ly6;

    return-void
.end method

.method public static A(Ljava/io/ByteArrayInputStream;LTg;)LUf;
    .locals 2

    sget-object v0, LUf;->DEFAULT_INSTANCE:LUf;

    new-instance v1, Lja;

    invoke-direct {v1, p0}, Lja;-><init>(Ljava/io/ByteArrayInputStream;)V

    invoke-static {v0, v1, p1}, Lvj;->s(Lvj;Lka;LTg;)Lvj;

    move-result-object p0

    invoke-static {p0}, Lvj;->g(Lvj;)V

    check-cast p0, LUf;

    return-object p0
.end method

.method public static w(LUf;Lx6;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUf;->encryptedKeyset_:Ly6;

    return-void
.end method

.method public static x(LUf;Lsn;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUf;->keysetInfo_:Lsn;

    return-void
.end method

.method public static z()LTf;
    .locals 1

    sget-object v0, LUf;->DEFAULT_INSTANCE:LUf;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, LTf;

    return-object v0
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
    sget-object p1, LUf;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, LUf;

    monitor-enter v0

    :try_start_0
    sget-object p1, LUf;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, LUf;->PARSER:LKt;

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
    sget-object p1, LUf;->DEFAULT_INSTANCE:LUf;

    return-object p1

    :pswitch_2
    new-instance p1, LTf;

    sget-object v0, LUf;->DEFAULT_INSTANCE:LUf;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, LUf;

    invoke-direct {p1}, LUf;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "encryptedKeyset_"

    const-string v0, "keysetInfo_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t"

    sget-object v1, LUf;->DEFAULT_INSTANCE:LUf;

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

.method public final y()Ly6;
    .locals 1

    iget-object v0, p0, LUf;->encryptedKeyset_:Ly6;

    return-object v0
.end method
