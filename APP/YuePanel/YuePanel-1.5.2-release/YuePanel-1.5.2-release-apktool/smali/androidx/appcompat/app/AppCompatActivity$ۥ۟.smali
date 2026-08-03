.class public Landroidx/appcompat/app/AppCompatActivity$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۡۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/AppCompatActivity;->ۥ۟۟۠ۤ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/AppCompatActivity;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/AppCompatActivity$ۥ۟;->ۥ:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/appcompat/app/AppCompatActivity$ۥ۟;->ۥ:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۡۡ()V

    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity$ۥ۟;->ۥ:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/ۥ;

    move-result-object v0

    const-string v1, "androidx:appcompat"

    invoke-virtual {v0, v1}, Landroidx/savedstate/ۥ;->ۥ۟(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟;->ۥ۟۟ۢ(Landroid/os/Bundle;)V

    return-void
.end method
