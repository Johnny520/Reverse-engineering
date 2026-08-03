.class public final Lh7;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:Lh7;

.field private static volatile PARSER:LKt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh7;

    invoke-direct {v0}, Lvj;-><init>()V

    sput-object v0, Lh7;->DEFAULT_INSTANCE:Lh7;

    const-class v1, Lh7;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public static w()Lh7;
    .locals 1

    sget-object v0, Lh7;->DEFAULT_INSTANCE:Lh7;

    return-object v0
.end method

.method public static x(Ly6;LTg;)Lh7;
    .locals 1

    sget-object v0, Lh7;->DEFAULT_INSTANCE:Lh7;

    invoke-static {v0, p0, p1}, Lvj;->r(Lvj;Ly6;LTg;)Lvj;

    move-result-object p0

    check-cast p0, Lh7;

    return-object p0
.end method


# virtual methods
.method public final i(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, LEy;->v(I)I

    move-result p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lh7;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lh7;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lh7;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lh7;->PARSER:LKt;

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
    sget-object p1, Lh7;->DEFAULT_INSTANCE:Lh7;

    return-object p1

    :pswitch_2
    new-instance p1, Lg7;

    sget-object v0, Lh7;->DEFAULT_INSTANCE:Lh7;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lg7;-><init>(Lvj;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lh7;

    invoke-direct {p1}, Lvj;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "\u0000\u0000"

    sget-object v1, Lh7;->DEFAULT_INSTANCE:Lh7;

    new-instance v2, Lbv;

    invoke-direct {v2, v1, p1, v0}, Lbv;-><init>(LB;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    return-object v0

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

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
