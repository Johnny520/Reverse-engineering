.class public abstract Lc0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW0/g;

    const-string v1, "UPDATE\\s+SnsInfo\\s+SET\\s+sourceType\\s*=\\s*sourceType\\s*&\\s*-3"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc0/l;->a:LW0/g;

    return-void
.end method
