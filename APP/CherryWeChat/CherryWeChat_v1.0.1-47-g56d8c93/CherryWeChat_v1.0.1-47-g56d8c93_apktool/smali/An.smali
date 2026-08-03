.class public final LAn;
.super Lvj;
.source ""


# static fields
.field private static final DEFAULT_INSTANCE:LAn;

.field public static final DEK_TEMPLATE_FIELD_NUMBER:I = 0x2

.field public static final KEK_URI_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LKt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field


# instance fields
.field private dekTemplate_:Len;

.field private kekUri_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAn;

    invoke-direct {v0}, LAn;-><init>()V

    sput-object v0, LAn;->DEFAULT_INSTANCE:LAn;

    const-class v1, LAn;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LAn;->kekUri_:Ljava/lang/String;

    return-void
.end method

.method public static A(Ly6;LTg;)LAn;
    .locals 1

    sget-object v0, LAn;->DEFAULT_INSTANCE:LAn;

    invoke-static {v0, p0, p1}, Lvj;->r(Lvj;Ly6;LTg;)Lvj;

    move-result-object p0

    check-cast p0, LAn;

    return-object p0
.end method

.method public static w()LAn;
    .locals 1

    sget-object v0, LAn;->DEFAULT_INSTANCE:LAn;

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
    sget-object p1, LAn;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, LAn;

    monitor-enter v0

    :try_start_0
    sget-object p1, LAn;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, LAn;->PARSER:LKt;

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
    sget-object p1, LAn;->DEFAULT_INSTANCE:LAn;

    return-object p1

    :pswitch_2
    new-instance p1, Lg7;

    sget-object v0, LAn;->DEFAULT_INSTANCE:LAn;

    const/4 v1, 0x3

    invoke-direct {p1, v0, v1}, Lg7;-><init>(Lvj;I)V

    return-object p1

    :pswitch_3
    new-instance p1, LAn;

    invoke-direct {p1}, LAn;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "kekUri_"

    const-string v0, "dekTemplate_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    sget-object v1, LAn;->DEFAULT_INSTANCE:LAn;

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

.method public final x()Len;
    .locals 1

    iget-object v0, p0, LAn;->dekTemplate_:Len;

    if-nez v0, :cond_0

    invoke-static {}, Len;->z()Len;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAn;->kekUri_:Ljava/lang/String;

    return-object v0
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, LAn;->dekTemplate_:Len;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
