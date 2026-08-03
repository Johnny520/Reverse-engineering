.class public final Lgn;
.super Lvj;
.source ""


# static fields
.field public static final CATALOGUE_NAME_FIELD_NUMBER:I = 0x5

.field private static final DEFAULT_INSTANCE:Lgn;

.field public static final KEY_MANAGER_VERSION_FIELD_NUMBER:I = 0x3

.field public static final NEW_KEY_ALLOWED_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:LKt; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LKt;"
        }
    .end annotation
.end field

.field public static final PRIMITIVE_NAME_FIELD_NUMBER:I = 0x1

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x2


# instance fields
.field private catalogueName_:Ljava/lang/String;

.field private keyManagerVersion_:I

.field private newKeyAllowed_:Z

.field private primitiveName_:Ljava/lang/String;

.field private typeUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgn;

    invoke-direct {v0}, Lgn;-><init>()V

    sput-object v0, Lgn;->DEFAULT_INSTANCE:Lgn;

    const-class v1, Lgn;

    invoke-static {v1, v0}, Lvj;->t(Ljava/lang/Class;Lvj;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvj;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lgn;->primitiveName_:Ljava/lang/String;

    iput-object v0, p0, Lgn;->typeUrl_:Ljava/lang/String;

    iput-object v0, p0, Lgn;->catalogueName_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final i(I)Ljava/lang/Object;
    .locals 4

    invoke-static {p1}, LEy;->v(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lgn;->PARSER:LKt;

    if-nez p1, :cond_1

    const-class v0, Lgn;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lgn;->PARSER:LKt;

    if-nez p1, :cond_0

    new-instance p1, Luj;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lgn;->PARSER:LKt;

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
    sget-object p1, Lgn;->DEFAULT_INSTANCE:Lgn;

    return-object p1

    :pswitch_2
    new-instance p1, Lg7;

    sget-object v0, Lgn;->DEFAULT_INSTANCE:Lgn;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lg7;-><init>(Lvj;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lgn;

    invoke-direct {p1}, Lgn;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "primitiveName_"

    const-string v0, "typeUrl_"

    const-string v1, "keyManagerVersion_"

    const-string v2, "newKeyAllowed_"

    const-string v3, "catalogueName_"

    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208"

    sget-object v1, Lgn;->DEFAULT_INSTANCE:Lgn;

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
