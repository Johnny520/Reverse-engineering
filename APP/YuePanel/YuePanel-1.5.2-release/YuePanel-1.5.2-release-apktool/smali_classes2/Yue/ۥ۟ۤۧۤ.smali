.class public final LYue/ۥ۟ۤۧۤ;
.super LYue/ۥ۟ۧۨۦ;
.source "SourceFile"


# annotations
.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟ۤۧۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥ۟ۤۧۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۤۧۤ;

    invoke-direct {v0}, LYue/ۥ۟ۤۧۤ;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۧۤ;->ۥ:LYue/ۥ۟ۤۧۤ;

    new-instance v0, LYue/ۥ۟ۤۧۤ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۤۧۤ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۧۤ;->ۥ۟:LYue/ۥ۟ۤۧۤ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۨۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۤۧۤ;->ۥ۟:LYue/ۥ۟ۤۧۤ$ۥ;

    invoke-static {v0, p1}, LYue/ۥۣ۟ۤۧ;->ۥ(LYue/ۥ۟ۤۧۤ$ۥ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۠ۡ۟;

    return-object p1
.end method
