.class public final Lj2;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:Lj2;

.field public static final KEY_SIZE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keySize_:I

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj2;

    invoke-direct {v0}, Lvj;-><init>()V

    sput-object v0, Lj2;->DEFAULT_INSTANCE:Lj2;

    const-class v1, Lj2;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public static w(Lj2;I)V
    .locals 0

    iput p1, p0, Lj2;->keySize_:I

    return-void
.end method

.method public static y()Li2;
    .locals 1

    sget-object v0, Lj2;->DEFAULT_INSTANCE:Lj2;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, Li2;

    return-object v0
.end method

.method public static z(Ly6;LTg;)Lj2;
    .locals 1

    sget-object v0, Lj2;->DEFAULT_INSTANCE:Lj2;

    invoke-static {v0, p0, p1}, Lvj;->r(Lvj;Ly6;LTg;)Lvj;

    move-result-object p0

    check-cast p0, Lj2;

    return-object p0
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
    sget-object p1, Lj2;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lj2;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lj2;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lj2;->PARSER:LKt;

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
    sget-object p1, Lj2;->DEFAULT_INSTANCE:Lj2;

    return-object p1

    :pswitch_2
    new-instance p1, Li2;

    sget-object v0, Lj2;->DEFAULT_INSTANCE:Lj2;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lj2;

    invoke-direct {p1}, Lvj;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "version_"

    const-string v0, "keySize_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b"

    sget-object v1, Lj2;->DEFAULT_INSTANCE:Lj2;

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

.method public final x()I
    .locals 1

    iget v0, p0, Lj2;->keySize_:I

    return v0
.end method
