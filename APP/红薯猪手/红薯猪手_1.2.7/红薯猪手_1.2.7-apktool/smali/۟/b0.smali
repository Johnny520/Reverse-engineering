.class public abstract L۟/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/v3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/b0$a;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sput-object v0, L۟/b0;->ۥ:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ۟()Ljava/lang/String;
.end method
