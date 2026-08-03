.class public final Lmn;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:Lmn;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

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


# instance fields
.field private keyData_:LVm;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmn;

    invoke-direct {v0}, Lvj;-><init>()V

    sput-object v0, Lmn;->DEFAULT_INSTANCE:Lmn;

    const-class v1, Lmn;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public static F()Lln;
    .locals 1

    sget-object v0, Lmn;->DEFAULT_INSTANCE:Lmn;

    invoke-virtual {v0}, Lvj;->h()Ltj;

    move-result-object v0

    check-cast v0, Lln;

    return-object v0
.end method

.method public static w(Lmn;LVm;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lmn;->keyData_:LVm;

    return-void
.end method

.method public static x(Lmn;Lyt;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lyt;->b()I

    move-result p1

    iput p1, p0, Lmn;->outputPrefixType_:I

    return-void
.end method

.method public static y(Lmn;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcn;->c:Lcn;

    invoke-virtual {v0}, Lcn;->a()I

    move-result v0

    iput v0, p0, Lmn;->status_:I

    return-void
.end method

.method public static z(Lmn;I)V
    .locals 0

    iput p1, p0, Lmn;->keyId_:I

    return-void
.end method


# virtual methods
.method public final A()LVm;
    .locals 1

    iget-object v0, p0, Lmn;->keyData_:LVm;

    if-nez v0, :cond_0

    invoke-static {}, LVm;->z()LVm;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final B()I
    .locals 1

    iget v0, p0, Lmn;->keyId_:I

    return v0
.end method

.method public final C()Lyt;
    .locals 1

    iget v0, p0, Lmn;->outputPrefixType_:I

    invoke-static {v0}, Lyt;->a(I)Lyt;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lyt;->g:Lyt;

    :cond_0
    return-object v0
.end method

.method public final D()Lcn;
    .locals 2

    iget v0, p0, Lmn;->status_:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lcn;->e:Lcn;

    goto :goto_0

    :cond_1
    sget-object v0, Lcn;->d:Lcn;

    goto :goto_0

    :cond_2
    sget-object v0, Lcn;->c:Lcn;

    goto :goto_0

    :cond_3
    sget-object v0, Lcn;->b:Lcn;

    :goto_0
    if-nez v0, :cond_4

    sget-object v0, Lcn;->f:Lcn;

    :cond_4
    return-object v0
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, Lmn;->keyData_:LVm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

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
    sget-object p1, Lmn;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lmn;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lmn;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lmn;->PARSER:LKt;

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
    sget-object p1, Lmn;->DEFAULT_INSTANCE:Lmn;

    return-object p1

    :pswitch_2
    new-instance p1, Lln;

    sget-object v0, Lmn;->DEFAULT_INSTANCE:Lmn;

    invoke-direct {p1, v0}, Ltj;-><init>(Lvj;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lmn;

    invoke-direct {p1}, Lvj;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "keyData_"

    const-string v0, "status_"

    const-string v1, "keyId_"

    const-string v2, "outputPrefixType_"

    filled-new-array {p1, v0, v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object v1, Lmn;->DEFAULT_INSTANCE:Lmn;

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
