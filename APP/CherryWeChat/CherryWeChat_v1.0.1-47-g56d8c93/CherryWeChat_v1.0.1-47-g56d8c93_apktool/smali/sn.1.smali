.class public final Lsn;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:Lsn;

.field public static final KEY_INFO_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyInfo_:LKl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKl;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsn;

    invoke-direct {v0}, Lsn;-><init>()V

    sput-object v0, Lsn;->DEFAULT_INSTANCE:Lsn;

    const-class v1, Lsn;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    sget-object v0, LIu;->d:LIu;

    iput-object v0, p0, Lsn;->keyInfo_:LKl;

    return-void
.end method

.method public static w(Lsn;I)V
    .locals 0

    iput p1, p0, Lsn;->primaryKeyId_:I

    return-void
.end method

.method public static x(Lsn;Lrn;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lsn;->keyInfo_:LKl;

    move-object v1, v0

    check-cast v1, LE;

    iget-boolean v1, v1, LE;->a:Z

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, LKl;->f(I)LKl;

    move-result-object v0

    iput-object v0, p0, Lsn;->keyInfo_:LKl;

    :cond_1
    iget-object p0, p0, Lsn;->keyInfo_:LKl;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static z()Lpn;
    .locals 1

    sget-object v0, Lsn;->DEFAULT_INSTANCE:Lsn;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, Lpn;

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
    sget-object p1, Lsn;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lsn;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lsn;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lsn;->PARSER:LKt;

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
    sget-object p1, Lsn;->DEFAULT_INSTANCE:Lsn;

    return-object p1

    :pswitch_2
    new-instance p1, Lpn;

    sget-object v0, Lsn;->DEFAULT_INSTANCE:Lsn;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lsn;

    invoke-direct {p1}, Lsn;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "primaryKeyId_"

    const-string v0, "keyInfo_"

    const-class v1, Lrn;

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object v1, Lsn;->DEFAULT_INSTANCE:Lsn;

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

.method public final y()Lrn;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lsn;->keyInfo_:LKl;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrn;

    return-object v0
.end method
