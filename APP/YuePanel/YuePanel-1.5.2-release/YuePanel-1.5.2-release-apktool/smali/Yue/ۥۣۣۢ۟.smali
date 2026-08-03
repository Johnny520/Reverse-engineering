.class public final synthetic LYue/ۥۣۣۢ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۤۧۧ;


# instance fields
.field public final synthetic ۥ:Landroid/content/UriMatcher;


# direct methods
.method public synthetic constructor <init>(Landroid/content/UriMatcher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۣۢ۟;->ۥ:Landroid/content/UriMatcher;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۣۢ۟;->ۥ:Landroid/content/UriMatcher;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, LYue/ۥۣۣۢ۠;->ۥ(Landroid/content/UriMatcher;Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
