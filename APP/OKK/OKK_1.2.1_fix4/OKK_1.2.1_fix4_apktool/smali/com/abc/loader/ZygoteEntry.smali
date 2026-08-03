.class public final Lcom/abc/loader/ZygoteEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Companion:Lf0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/abc/loader/ZygoteEntry;->Companion:Lf0/g0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public initZygote(Lde/robv/android/xposed/a;)V
    .locals 1

    const-string v0, "startupParam"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
