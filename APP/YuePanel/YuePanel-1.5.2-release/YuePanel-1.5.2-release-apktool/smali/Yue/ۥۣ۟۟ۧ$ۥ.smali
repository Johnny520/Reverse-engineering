.class public LYue/ۥۣ۟۟ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۟ۧ;->ۥ۟۟ۢۡ(Landroid/app/Activity;[Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/app/Activity;

.field public final synthetic ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>([Ljava/lang/String;Landroid/app/Activity;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥۣ۟۟۠:[Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    iput p3, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥۣ۟۟۠:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [I

    iget-object v1, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥۣ۟۟۠:[Ljava/lang/String;

    array-length v3, v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    iget-object v5, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥۣ۟۟۠:[Ljava/lang/String;

    aget-object v5, v5, v4

    invoke-virtual {v1, v5, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    aput v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Landroid/app/Activity;

    check-cast v1, LYue/ۥۣ۟۟ۧ$ۥۣ۟۟۟;

    iget v2, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥ۟۟۠ۥ:I

    iget-object v3, p0, LYue/ۥۣ۟۟ۧ$ۥ;->ۥۣ۟۟۠:[Ljava/lang/String;

    invoke-interface {v1, v2, v3, v0}, LYue/ۥۣ۟۟ۧ$ۥۣ۟۟۟;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method
