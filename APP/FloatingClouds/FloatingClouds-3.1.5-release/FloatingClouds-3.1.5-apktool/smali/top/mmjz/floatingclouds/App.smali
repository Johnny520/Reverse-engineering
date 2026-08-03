.class public final Ltop/mmjz/floatingclouds/App;
.super Landroid/app/Application;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/mmjz/floatingclouds/App$a;
    }
.end annotation


# static fields
.field public static final Companion:Ltop/mmjz/floatingclouds/App$a;

.field public static instance:Ltop/mmjz/floatingclouds/App;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/mmjz/floatingclouds/App$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltop/mmjz/floatingclouds/App;->Companion:Ltop/mmjz/floatingclouds/App$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    sput-object p0, La/w1;->p:Landroid/content/Context;

    invoke-static {p0}, La/w1;->D(Landroid/content/Context;)V

    sget-object v0, Ltop/mmjz/floatingclouds/App;->Companion:Ltop/mmjz/floatingclouds/App$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object p0, Ltop/mmjz/floatingclouds/App;->instance:Ltop/mmjz/floatingclouds/App;

    return-void
.end method
