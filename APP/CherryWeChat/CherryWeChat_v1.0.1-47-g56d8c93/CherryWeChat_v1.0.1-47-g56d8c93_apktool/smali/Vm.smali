.class public final LVm;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:LVm;

.field public static final KEY_MATERIAL_TYPE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1

.field public static final VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyMaterialType_:I

.field private typeUrl_:Ljava/lang/String;

.field private value_:Ly6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LVm;

    invoke-direct {v0}, LVm;-><init>()V

    sput-object v0, LVm;->DEFAULT_INSTANCE:LVm;

    const-class v1, LVm;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LVm;->typeUrl_:Ljava/lang/String;

    sget-object v0, Ly6;->b:Lx6;

    iput-object v0, p0, LVm;->value_:Ly6;

    return-void
.end method

.method public static D()LTm;
    .locals 1

    sget-object v0, LVm;->DEFAULT_INSTANCE:LVm;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, LTm;

    return-object v0
.end method

.method public static w(LVm;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LVm;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public static x(LVm;Lx6;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LVm;->value_:Ly6;

    return-void
.end method

.method public static y(LVm;LUm;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LUm;->g:LUm;

    if-eq p1, v0, :cond_0

    iget p1, p1, LUm;->a:I

    iput p1, p0, LVm;->keyMaterialType_:I

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z()LVm;
    .locals 1

    sget-object v0, LVm;->DEFAULT_INSTANCE:LVm;

    return-object v0
.end method


# virtual methods
.method public final A()LUm;
    .locals 2

    iget v0, p0, LVm;->keyMaterialType_:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, LUm;->f:LUm;

    goto :goto_0

    :cond_1
    sget-object v0, LUm;->e:LUm;

    goto :goto_0

    :cond_2
    sget-object v0, LUm;->d:LUm;

    goto :goto_0

    :cond_3
    sget-object v0, LUm;->c:LUm;

    goto :goto_0

    :cond_4
    sget-object v0, LUm;->b:LUm;

    :goto_0
    if-nez v0, :cond_5

    sget-object v0, LUm;->g:LUm;

    :cond_5
    return-object v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVm;->typeUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public final C()Ly6;
    .locals 1

    iget-object v0, p0, LVm;->value_:Ly6;

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
    sget-object p1, LVm;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, LVm;

    monitor-enter v0

    :try_start_0
    sget-object p1, LVm;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, LVm;->PARSER:LKt;

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
    sget-object p1, LVm;->DEFAULT_INSTANCE:LVm;

    return-object p1

    :pswitch_2
    new-instance p1, LTm;

    sget-object v0, LVm;->DEFAULT_INSTANCE:LVm;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, LVm;

    invoke-direct {p1}, LVm;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "typeUrl_"

    const-string v0, "value_"

    const-string v1, "keyMaterialType_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    sget-object v1, LVm;->DEFAULT_INSTANCE:LVm;

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
