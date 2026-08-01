.class public final Ln4;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le51;


# instance fields
.field public final synthetic α:Landroidx/appcompat/app/AppCompatActivity;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln4;->α:Landroidx/appcompat/app/AppCompatActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 2

    .line 1
    iget-object p0, p0, Ln4;->α:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/α;->α()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 11
    .line 12
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ln5;

    .line 15
    .line 16
    const-string v1, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ln5;->ν(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/appcompat/app/α;->γ()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
