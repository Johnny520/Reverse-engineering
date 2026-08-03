.class public final LJ0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWs;


# static fields
.field public static final a:LJ0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LJ0;->a:LJ0;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Active"

    return-object v0
.end method
