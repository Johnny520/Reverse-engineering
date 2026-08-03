.class public final LVs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lje;
.implements Lh9;


# static fields
.field public static final a:LVs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVs;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LVs;->a:LVs;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
